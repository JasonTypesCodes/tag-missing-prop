package tag.missing.prop

class ChildTagLib extends SomeTagLib {
    static namespace = "child"

    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def sayFalse = {
        out << g.message(code: 'default.boolean.false')
    }

    @Override
    Object propertyMissing(String name) {
        return super.propertyMissing(name)
    }
}
