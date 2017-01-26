package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_351 {
    private final Production94_351 production = new Production94_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}