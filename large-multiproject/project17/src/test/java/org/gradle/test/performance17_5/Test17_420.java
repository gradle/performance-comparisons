package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_420 {
    private final Production17_420 production = new Production17_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}