package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_190 {
    private final Production17_190 production = new Production17_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}