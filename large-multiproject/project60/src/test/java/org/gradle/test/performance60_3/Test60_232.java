package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_232 {
    private final Production60_232 production = new Production60_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}