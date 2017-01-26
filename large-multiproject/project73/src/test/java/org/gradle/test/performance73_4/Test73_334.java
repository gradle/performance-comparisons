package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_334 {
    private final Production73_334 production = new Production73_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}