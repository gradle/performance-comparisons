package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_228 {
    private final Production25_228 production = new Production25_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}