package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_275 {
    private final Production60_275 production = new Production60_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}