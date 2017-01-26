package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_129 {
    private final Production73_129 production = new Production73_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}