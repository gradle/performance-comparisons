package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_52 {
    private final Production17_52 production = new Production17_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}