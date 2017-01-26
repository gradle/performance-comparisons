package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_112 {
    private final Production25_112 production = new Production25_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}