package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_87 {
    private final Production17_87 production = new Production17_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}