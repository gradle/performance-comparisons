package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_184 {
    private final Production60_184 production = new Production60_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}