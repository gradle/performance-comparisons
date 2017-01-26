package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_483 {
    private final Production73_483 production = new Production73_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}