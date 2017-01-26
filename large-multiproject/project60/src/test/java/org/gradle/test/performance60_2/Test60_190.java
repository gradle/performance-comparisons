package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_190 {
    private final Production60_190 production = new Production60_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}