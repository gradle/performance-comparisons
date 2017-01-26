package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_321 {
    private final Production60_321 production = new Production60_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}