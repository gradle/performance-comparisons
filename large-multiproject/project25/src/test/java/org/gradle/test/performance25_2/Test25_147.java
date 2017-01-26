package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_147 {
    private final Production25_147 production = new Production25_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}