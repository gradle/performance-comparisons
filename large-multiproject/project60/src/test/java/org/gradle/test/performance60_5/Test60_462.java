package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_462 {
    private final Production60_462 production = new Production60_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}