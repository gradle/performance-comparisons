package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_190 {
    private final Production94_190 production = new Production94_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}