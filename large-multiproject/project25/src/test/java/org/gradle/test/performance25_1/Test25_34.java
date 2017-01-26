package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_34 {
    private final Production25_34 production = new Production25_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}