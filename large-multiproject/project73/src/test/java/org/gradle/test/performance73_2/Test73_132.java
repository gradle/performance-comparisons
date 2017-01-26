package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_132 {
    private final Production73_132 production = new Production73_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}