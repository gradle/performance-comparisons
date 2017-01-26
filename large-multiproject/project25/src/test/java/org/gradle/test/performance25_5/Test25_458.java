package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_458 {
    private final Production25_458 production = new Production25_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}