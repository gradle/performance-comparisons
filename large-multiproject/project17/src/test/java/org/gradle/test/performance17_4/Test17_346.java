package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_346 {
    private final Production17_346 production = new Production17_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}