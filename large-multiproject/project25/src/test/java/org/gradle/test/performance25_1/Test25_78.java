package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_78 {
    private final Production25_78 production = new Production25_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}