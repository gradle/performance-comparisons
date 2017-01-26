package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_213 {
    private final Production60_213 production = new Production60_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}