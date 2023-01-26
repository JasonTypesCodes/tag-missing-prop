package tag.missing.prop

import grails.artefact.TagLibrary

class SomeTagLib implements TagLibrary {
    static defaultEncodeAs = [taglib:'html']
    static namespace = 'some'

    int call = 0
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def sayTrue = {
        out << g.message(code: 'default.boolean.true')
    }

    @Override
    Object propertyMissing(String name) {
        call++
        println "Property Missing called ${call} times for '${name}'"
        return TagLibrary.super.propertyMissing(name)
    }
}
