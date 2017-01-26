package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_311 {
    private final Production17_311 production = new Production17_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}