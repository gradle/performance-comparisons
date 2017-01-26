package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_105 {
    private final Production17_105 production = new Production17_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}