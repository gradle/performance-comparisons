package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_146 {
    private final Production15_146 production = new Production15_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}