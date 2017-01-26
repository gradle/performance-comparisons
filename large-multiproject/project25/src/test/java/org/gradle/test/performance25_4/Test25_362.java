package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_362 {
    private final Production25_362 production = new Production25_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}