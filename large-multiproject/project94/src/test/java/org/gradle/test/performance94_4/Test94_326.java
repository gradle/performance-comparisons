package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_326 {
    private final Production94_326 production = new Production94_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}