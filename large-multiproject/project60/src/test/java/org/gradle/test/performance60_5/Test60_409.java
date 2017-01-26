package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_409 {
    private final Production60_409 production = new Production60_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}