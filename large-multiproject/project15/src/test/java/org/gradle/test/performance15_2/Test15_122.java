package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_122 {
    private final Production15_122 production = new Production15_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}