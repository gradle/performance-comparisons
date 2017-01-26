package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_23 {
    private final Production73_23 production = new Production73_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}