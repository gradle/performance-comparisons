package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_141 {
    private final Production17_141 production = new Production17_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}