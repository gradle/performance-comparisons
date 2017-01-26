package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_336 {
    private final Production1_336 production = new Production1_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}