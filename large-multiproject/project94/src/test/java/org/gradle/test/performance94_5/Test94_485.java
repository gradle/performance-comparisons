package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_485 {
    private final Production94_485 production = new Production94_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}