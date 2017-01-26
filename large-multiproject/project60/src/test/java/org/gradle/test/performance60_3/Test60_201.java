package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_201 {
    private final Production60_201 production = new Production60_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}