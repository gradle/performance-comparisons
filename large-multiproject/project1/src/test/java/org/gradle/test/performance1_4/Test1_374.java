package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_374 {
    private final Production1_374 production = new Production1_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}