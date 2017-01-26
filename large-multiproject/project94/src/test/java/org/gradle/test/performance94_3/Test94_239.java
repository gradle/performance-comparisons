package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_239 {
    private final Production94_239 production = new Production94_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}