package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_272 {
    private final Production17_272 production = new Production17_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}