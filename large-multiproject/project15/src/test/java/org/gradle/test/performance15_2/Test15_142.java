package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_142 {
    private final Production15_142 production = new Production15_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}