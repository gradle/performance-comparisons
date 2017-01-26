package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_93 {
    private final Production25_93 production = new Production25_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}