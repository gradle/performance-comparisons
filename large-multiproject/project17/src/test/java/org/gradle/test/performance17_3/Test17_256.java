package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_256 {
    private final Production17_256 production = new Production17_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}