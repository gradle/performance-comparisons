package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_116 {
    private final Production60_116 production = new Production60_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}