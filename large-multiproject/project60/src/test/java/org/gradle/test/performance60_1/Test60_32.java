package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_32 {
    private final Production60_32 production = new Production60_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}