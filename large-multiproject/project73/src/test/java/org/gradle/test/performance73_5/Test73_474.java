package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_474 {
    private final Production73_474 production = new Production73_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}