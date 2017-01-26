package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_20 {
    private final Production60_20 production = new Production60_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}