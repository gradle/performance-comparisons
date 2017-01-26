package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_156 {
    private final Production15_156 production = new Production15_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}