package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_242 {
    private final Production60_242 production = new Production60_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}