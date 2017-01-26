package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_103 {
    private final Production60_103 production = new Production60_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}