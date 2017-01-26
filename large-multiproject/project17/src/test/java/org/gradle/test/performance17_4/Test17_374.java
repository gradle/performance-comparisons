package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_374 {
    private final Production17_374 production = new Production17_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}