package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_232 {
    private final Production17_232 production = new Production17_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}