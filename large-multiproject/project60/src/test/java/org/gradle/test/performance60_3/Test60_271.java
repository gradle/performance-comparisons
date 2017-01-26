package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_271 {
    private final Production60_271 production = new Production60_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}