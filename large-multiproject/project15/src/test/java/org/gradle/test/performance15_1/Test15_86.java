package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_86 {
    private final Production15_86 production = new Production15_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}