package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_202 {
    private final Production25_202 production = new Production25_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}