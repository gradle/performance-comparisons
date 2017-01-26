package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_283 {
    private final Production60_283 production = new Production60_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}