package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_253 {
    private final Production25_253 production = new Production25_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}