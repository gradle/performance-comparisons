package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_336 {
    private final Production45_336 production = new Production45_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}