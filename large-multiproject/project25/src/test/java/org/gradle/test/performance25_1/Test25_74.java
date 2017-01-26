package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_74 {
    private final Production25_74 production = new Production25_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}