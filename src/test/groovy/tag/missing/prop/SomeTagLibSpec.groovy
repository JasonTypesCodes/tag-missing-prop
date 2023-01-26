package tag.missing.prop

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class SomeTagLibSpec extends Specification implements TagLibUnitTest<SomeTagLib> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
