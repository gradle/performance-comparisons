package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_392 {
    private final Production25_392 production = new Production25_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}