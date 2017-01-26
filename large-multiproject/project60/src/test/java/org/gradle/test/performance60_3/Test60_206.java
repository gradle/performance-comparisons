package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_206 {
    private final Production60_206 production = new Production60_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}