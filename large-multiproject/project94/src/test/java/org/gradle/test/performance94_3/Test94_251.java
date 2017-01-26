package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_251 {
    private final Production94_251 production = new Production94_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}