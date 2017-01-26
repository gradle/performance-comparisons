package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_16 {
    private final Production60_16 production = new Production60_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}