package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_56 {
    private final Production60_56 production = new Production60_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}