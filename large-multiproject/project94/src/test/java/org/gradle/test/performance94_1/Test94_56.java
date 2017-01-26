package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_56 {
    private final Production94_56 production = new Production94_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}