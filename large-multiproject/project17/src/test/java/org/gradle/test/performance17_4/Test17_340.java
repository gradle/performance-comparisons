package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_340 {
    private final Production17_340 production = new Production17_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}