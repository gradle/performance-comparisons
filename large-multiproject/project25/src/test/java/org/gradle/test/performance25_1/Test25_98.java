package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_98 {
    private final Production25_98 production = new Production25_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}