package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_304 {
    private final Production94_304 production = new Production94_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}