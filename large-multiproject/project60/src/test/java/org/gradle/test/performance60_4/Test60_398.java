package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_398 {
    private final Production60_398 production = new Production60_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}