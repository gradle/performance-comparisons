package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_129 {
    private final Production60_129 production = new Production60_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}