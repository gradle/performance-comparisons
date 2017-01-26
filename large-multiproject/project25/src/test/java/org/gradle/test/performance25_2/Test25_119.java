package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_119 {
    private final Production25_119 production = new Production25_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}