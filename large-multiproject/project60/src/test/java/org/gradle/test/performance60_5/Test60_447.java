package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_447 {
    private final Production60_447 production = new Production60_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}