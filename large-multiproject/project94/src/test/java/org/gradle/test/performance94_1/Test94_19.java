package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_19 {
    private final Production94_19 production = new Production94_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}