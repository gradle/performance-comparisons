package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_75 {
    private final Production25_75 production = new Production25_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}