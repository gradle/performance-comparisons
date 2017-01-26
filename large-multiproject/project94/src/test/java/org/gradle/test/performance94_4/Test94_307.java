package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_307 {
    private final Production94_307 production = new Production94_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}