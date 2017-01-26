package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_143 {
    private final Production60_143 production = new Production60_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}