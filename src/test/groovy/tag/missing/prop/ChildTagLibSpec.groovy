package tag.missing.prop

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class ChildTagLibSpec extends Specification implements TagLibUnitTest<ChildTagLib> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
