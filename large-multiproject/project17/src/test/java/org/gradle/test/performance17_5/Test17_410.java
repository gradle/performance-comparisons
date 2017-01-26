package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_410 {
    private final Production17_410 production = new Production17_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}