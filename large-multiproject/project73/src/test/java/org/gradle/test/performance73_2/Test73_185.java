package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_185 {
    private final Production73_185 production = new Production73_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}