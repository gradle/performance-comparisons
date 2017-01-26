package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_160 {
    private final Production17_160 production = new Production17_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}