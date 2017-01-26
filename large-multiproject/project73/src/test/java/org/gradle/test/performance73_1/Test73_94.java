package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_94 {
    private final Production73_94 production = new Production73_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}