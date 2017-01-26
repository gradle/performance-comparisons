package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_388 {
    private final Production94_388 production = new Production94_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}