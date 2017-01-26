package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_180 {
    private final Production15_180 production = new Production15_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}