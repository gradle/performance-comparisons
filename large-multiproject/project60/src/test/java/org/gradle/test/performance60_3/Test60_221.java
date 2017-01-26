package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_221 {
    private final Production60_221 production = new Production60_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}