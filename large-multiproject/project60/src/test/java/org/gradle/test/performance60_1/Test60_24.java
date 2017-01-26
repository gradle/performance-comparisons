package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_24 {
    private final Production60_24 production = new Production60_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}