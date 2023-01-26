package tag.missing.prop

import grails.artefact.TagLibrary

class SomeTagLib implements TagLibrary {
    static defaultEncodeAs = [taglib:'html']
    static namespace = 'some'

    Map<String, Integer> propMissCount = [:]
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def sayTrue = {
        out << g.message(code: 'default.boolean.true')
    }

    @Override
    Object propertyMissing(String name) {
        String key = "${this.class.name} :: ${name}"

        int callNum = propMissCount.get(key, 0)
        callNum++
        propMissCount.put(key, callNum)

        println "Property Missing called! ${key} ; ${callNum}"
        return TagLibrary.super.propertyMissing(name)
    }
}
