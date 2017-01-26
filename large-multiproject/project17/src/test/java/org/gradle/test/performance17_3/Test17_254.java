package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_254 {
    private final Production17_254 production = new Production17_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}