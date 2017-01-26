package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_266 {
    private final Production25_266 production = new Production25_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}