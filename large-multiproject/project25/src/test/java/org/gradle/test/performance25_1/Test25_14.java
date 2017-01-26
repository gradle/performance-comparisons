package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_14 {
    private final Production25_14 production = new Production25_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}