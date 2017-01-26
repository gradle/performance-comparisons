package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_160 {
    private final Production60_160 production = new Production60_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}