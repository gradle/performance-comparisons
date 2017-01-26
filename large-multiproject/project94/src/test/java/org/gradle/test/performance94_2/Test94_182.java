package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_182 {
    private final Production94_182 production = new Production94_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}