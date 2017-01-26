package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_216 {
    private final Production25_216 production = new Production25_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}