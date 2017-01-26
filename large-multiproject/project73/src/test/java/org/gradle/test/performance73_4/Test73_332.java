package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_332 {
    private final Production73_332 production = new Production73_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}