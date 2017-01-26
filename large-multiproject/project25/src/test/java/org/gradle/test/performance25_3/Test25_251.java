package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_251 {
    private final Production25_251 production = new Production25_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}