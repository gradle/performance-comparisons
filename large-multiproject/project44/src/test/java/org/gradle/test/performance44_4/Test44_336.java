package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_336 {
    private final Production44_336 production = new Production44_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}