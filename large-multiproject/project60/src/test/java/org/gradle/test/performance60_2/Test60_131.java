package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_131 {
    private final Production60_131 production = new Production60_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}