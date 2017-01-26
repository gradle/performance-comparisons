package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_284 {
    private final Production17_284 production = new Production17_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}