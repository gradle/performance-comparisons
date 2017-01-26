package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_287 {
    private final Production17_287 production = new Production17_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}