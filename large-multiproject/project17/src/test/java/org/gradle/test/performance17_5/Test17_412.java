package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_412 {
    private final Production17_412 production = new Production17_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}