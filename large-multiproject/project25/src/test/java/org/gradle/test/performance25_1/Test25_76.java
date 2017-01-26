package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_76 {
    private final Production25_76 production = new Production25_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}