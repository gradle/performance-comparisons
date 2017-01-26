package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_342 {
    private final Production73_342 production = new Production73_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}