package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_492 {
    private final Production17_492 production = new Production17_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}