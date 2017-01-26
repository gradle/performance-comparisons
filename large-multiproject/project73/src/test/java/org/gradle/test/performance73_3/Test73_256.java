package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_256 {
    private final Production73_256 production = new Production73_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}