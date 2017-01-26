package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_65 {
    private final Production94_65 production = new Production94_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}