package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_115 {
    private final Production60_115 production = new Production60_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}