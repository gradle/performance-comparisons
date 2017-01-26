package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_300 {
    private final Production25_300 production = new Production25_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}