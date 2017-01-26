package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_165 {
    private final Production60_165 production = new Production60_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}