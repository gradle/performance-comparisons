package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_498 {
    private final Production73_498 production = new Production73_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}