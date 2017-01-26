package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_336 {
    private final Production17_336 production = new Production17_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}