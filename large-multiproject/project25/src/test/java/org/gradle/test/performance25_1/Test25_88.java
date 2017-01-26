package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_88 {
    private final Production25_88 production = new Production25_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}