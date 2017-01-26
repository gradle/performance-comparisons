package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_164 {
    private final Production60_164 production = new Production60_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}