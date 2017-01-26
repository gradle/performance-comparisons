package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_266 {
    private final Production94_266 production = new Production94_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}