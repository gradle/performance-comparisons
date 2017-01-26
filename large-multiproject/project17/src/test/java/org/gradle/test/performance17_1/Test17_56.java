package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_56 {
    private final Production17_56 production = new Production17_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}