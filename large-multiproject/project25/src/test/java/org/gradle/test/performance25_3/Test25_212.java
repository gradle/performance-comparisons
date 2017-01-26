package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_212 {
    private final Production25_212 production = new Production25_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}