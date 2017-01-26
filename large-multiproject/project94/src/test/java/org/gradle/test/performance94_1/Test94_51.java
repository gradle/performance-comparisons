package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_51 {
    private final Production94_51 production = new Production94_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}