package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_423 {
    private final Production17_423 production = new Production17_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}