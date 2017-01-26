package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_220 {
    private final Production25_220 production = new Production25_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}