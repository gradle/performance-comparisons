package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_489 {
    private final Production60_489 production = new Production60_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}