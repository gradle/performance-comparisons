package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_199 {
    private final Production60_199 production = new Production60_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}