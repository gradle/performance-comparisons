package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_122 {
    private final Production17_122 production = new Production17_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}