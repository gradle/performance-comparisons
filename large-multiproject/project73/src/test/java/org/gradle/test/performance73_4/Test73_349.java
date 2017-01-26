package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_349 {
    private final Production73_349 production = new Production73_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}