package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_136 {
    private final Production60_136 production = new Production60_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}