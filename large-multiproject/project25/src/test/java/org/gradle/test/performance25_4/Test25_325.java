package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_325 {
    private final Production25_325 production = new Production25_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}