package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_171 {
    private final Production60_171 production = new Production60_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}