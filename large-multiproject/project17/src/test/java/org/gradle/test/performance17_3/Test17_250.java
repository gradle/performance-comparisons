package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_250 {
    private final Production17_250 production = new Production17_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}