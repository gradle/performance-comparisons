package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_438 {
    private final Production73_438 production = new Production73_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}