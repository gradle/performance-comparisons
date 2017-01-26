package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_86 {
    private final Production60_86 production = new Production60_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}