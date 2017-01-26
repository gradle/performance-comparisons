package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_220 {
    private final Production94_220 production = new Production94_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}