package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_195 {
    private final Production25_195 production = new Production25_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}