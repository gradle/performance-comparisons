package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_227 {
    private final Production94_227 production = new Production94_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}