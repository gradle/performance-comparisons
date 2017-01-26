package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_197 {
    private final Production60_197 production = new Production60_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}