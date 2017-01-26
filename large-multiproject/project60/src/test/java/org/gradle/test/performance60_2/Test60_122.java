package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_122 {
    private final Production60_122 production = new Production60_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}