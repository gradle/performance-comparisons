package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_67 {
    private final Production25_67 production = new Production25_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}