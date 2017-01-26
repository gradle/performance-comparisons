package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_2 {
    private final Production25_2 production = new Production25_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}