package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_158 {
    private final Production15_158 production = new Production15_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}