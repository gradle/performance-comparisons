package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_392 {
    private final Production94_392 production = new Production94_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}