package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_403 {
    private final Production17_403 production = new Production17_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}