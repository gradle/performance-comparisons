package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_341 {
    private final Production73_341 production = new Production73_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}