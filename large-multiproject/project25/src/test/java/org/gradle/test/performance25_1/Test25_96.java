package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_96 {
    private final Production25_96 production = new Production25_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}