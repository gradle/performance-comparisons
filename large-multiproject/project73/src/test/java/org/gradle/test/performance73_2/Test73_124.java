package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_124 {
    private final Production73_124 production = new Production73_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}