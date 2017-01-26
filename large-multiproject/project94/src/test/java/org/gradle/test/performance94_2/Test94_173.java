package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_173 {
    private final Production94_173 production = new Production94_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}