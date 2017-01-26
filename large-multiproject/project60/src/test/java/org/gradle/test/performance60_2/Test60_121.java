package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_121 {
    private final Production60_121 production = new Production60_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}