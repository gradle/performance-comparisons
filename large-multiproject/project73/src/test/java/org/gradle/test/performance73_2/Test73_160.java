package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_160 {
    private final Production73_160 production = new Production73_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}