package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_389 {
    private final Production17_389 production = new Production17_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}