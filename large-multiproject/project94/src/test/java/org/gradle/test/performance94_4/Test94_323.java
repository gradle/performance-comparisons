package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_323 {
    private final Production94_323 production = new Production94_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}