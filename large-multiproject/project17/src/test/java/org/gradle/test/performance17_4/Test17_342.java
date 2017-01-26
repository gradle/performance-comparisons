package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_342 {
    private final Production17_342 production = new Production17_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}