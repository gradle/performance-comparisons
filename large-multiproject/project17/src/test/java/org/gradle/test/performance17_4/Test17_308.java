package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_308 {
    private final Production17_308 production = new Production17_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}