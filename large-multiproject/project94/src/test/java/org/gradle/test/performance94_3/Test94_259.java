package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_259 {
    private final Production94_259 production = new Production94_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}