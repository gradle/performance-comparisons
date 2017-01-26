package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_18 {
    private final Production60_18 production = new Production60_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}