package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_407 {
    private final Production73_407 production = new Production73_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}