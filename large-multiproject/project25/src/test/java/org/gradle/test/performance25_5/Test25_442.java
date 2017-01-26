package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_442 {
    private final Production25_442 production = new Production25_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}