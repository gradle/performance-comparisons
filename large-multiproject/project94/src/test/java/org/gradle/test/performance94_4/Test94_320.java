package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_320 {
    private final Production94_320 production = new Production94_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}