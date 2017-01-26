package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_241 {
    private final Production25_241 production = new Production25_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}