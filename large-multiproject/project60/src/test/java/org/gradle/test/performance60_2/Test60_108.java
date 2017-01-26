package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_108 {
    private final Production60_108 production = new Production60_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}