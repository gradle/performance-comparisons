package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_106 {
    private final Production94_106 production = new Production94_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}