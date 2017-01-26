package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_310 {
    private final Production25_310 production = new Production25_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}