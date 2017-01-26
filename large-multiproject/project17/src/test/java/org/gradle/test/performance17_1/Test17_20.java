package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_20 {
    private final Production17_20 production = new Production17_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}