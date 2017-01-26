package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_354 {
    private final Production60_354 production = new Production60_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}