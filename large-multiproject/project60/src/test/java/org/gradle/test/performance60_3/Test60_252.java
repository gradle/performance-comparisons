package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_252 {
    private final Production60_252 production = new Production60_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}