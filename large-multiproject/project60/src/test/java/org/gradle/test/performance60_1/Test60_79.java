package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_79 {
    private final Production60_79 production = new Production60_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}