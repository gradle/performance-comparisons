package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_176 {
    private final Production15_176 production = new Production15_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}