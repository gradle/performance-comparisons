package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_293 {
    private final Production25_293 production = new Production25_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}