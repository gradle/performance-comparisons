package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_80 {
    private final Production25_80 production = new Production25_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}