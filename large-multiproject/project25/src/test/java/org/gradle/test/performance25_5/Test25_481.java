package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_481 {
    private final Production25_481 production = new Production25_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}