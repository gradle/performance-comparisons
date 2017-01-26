package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_38 {
    private final Production25_38 production = new Production25_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}