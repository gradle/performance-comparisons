package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_175 {
    private final Production17_175 production = new Production17_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}