package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_254 {
    private final Production94_254 production = new Production94_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}