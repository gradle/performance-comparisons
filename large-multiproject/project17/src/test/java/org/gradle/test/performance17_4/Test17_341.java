package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_341 {
    private final Production17_341 production = new Production17_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}