package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_161 {
    private final Production17_161 production = new Production17_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}