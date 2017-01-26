package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_356 {
    private final Production25_356 production = new Production25_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}