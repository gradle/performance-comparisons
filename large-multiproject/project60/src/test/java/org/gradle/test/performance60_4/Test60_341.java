package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_341 {
    private final Production60_341 production = new Production60_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}