package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_238 {
    private final Production25_238 production = new Production25_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}