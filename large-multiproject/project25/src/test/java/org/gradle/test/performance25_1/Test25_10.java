package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_10 {
    private final Production25_10 production = new Production25_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}