package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_292 {
    private final Production73_292 production = new Production73_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}