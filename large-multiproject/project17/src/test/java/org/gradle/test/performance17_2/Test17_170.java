package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_170 {
    private final Production17_170 production = new Production17_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}