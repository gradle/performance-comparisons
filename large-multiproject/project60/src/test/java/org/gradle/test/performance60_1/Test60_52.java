package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_52 {
    private final Production60_52 production = new Production60_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}