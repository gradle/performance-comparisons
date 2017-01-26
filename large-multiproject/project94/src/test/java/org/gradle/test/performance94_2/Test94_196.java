package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_196 {
    private final Production94_196 production = new Production94_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}