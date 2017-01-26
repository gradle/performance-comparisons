package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_106 {
    private final Production17_106 production = new Production17_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}