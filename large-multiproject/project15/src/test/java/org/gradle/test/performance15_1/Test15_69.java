package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_69 {
    private final Production15_69 production = new Production15_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}