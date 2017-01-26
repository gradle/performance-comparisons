package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_237 {
    private final Production17_237 production = new Production17_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}