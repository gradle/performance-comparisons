package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_412 {
    private final Production73_412 production = new Production73_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}