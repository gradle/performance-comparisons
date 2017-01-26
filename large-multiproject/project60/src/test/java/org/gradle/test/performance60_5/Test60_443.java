package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_443 {
    private final Production60_443 production = new Production60_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}