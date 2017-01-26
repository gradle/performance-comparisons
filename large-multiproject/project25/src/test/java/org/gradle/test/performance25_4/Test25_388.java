package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_388 {
    private final Production25_388 production = new Production25_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}