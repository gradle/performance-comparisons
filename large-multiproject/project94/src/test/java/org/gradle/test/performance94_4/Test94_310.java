package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_310 {
    private final Production94_310 production = new Production94_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}