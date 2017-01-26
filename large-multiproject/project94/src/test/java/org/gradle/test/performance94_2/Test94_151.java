package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_151 {
    private final Production94_151 production = new Production94_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}