package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_253 {
    private final Production94_253 production = new Production94_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}