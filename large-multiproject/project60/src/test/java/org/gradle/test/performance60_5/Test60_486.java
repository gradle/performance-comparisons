package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_486 {
    private final Production60_486 production = new Production60_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}