package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_278 {
    private final Production17_278 production = new Production17_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}