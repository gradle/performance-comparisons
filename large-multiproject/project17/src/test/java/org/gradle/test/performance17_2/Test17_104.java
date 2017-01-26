package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_104 {
    private final Production17_104 production = new Production17_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}