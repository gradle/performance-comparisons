package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_301 {
    private final Production17_301 production = new Production17_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}