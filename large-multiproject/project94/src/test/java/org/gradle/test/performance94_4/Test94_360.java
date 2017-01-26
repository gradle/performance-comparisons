package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_360 {
    private final Production94_360 production = new Production94_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}