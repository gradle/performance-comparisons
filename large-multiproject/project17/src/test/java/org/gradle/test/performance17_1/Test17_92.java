package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_92 {
    private final Production17_92 production = new Production17_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}