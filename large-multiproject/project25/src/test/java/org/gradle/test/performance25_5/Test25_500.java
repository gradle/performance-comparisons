package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_500 {
    private final Production25_500 production = new Production25_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}