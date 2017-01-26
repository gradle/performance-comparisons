package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_3 {
    private final Production25_3 production = new Production25_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}