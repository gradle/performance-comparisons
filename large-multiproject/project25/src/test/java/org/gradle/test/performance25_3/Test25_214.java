package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_214 {
    private final Production25_214 production = new Production25_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}