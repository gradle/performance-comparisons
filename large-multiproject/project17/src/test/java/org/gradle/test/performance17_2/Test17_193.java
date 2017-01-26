package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_193 {
    private final Production17_193 production = new Production17_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}