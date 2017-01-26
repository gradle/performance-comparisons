package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_161 {
    private final Production94_161 production = new Production94_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}