package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_226 {
    private final Production17_226 production = new Production17_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}