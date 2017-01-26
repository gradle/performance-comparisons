package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_179 {
    private final Production60_179 production = new Production60_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}