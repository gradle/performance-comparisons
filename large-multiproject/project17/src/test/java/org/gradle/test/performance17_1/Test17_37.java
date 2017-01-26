package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_37 {
    private final Production17_37 production = new Production17_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}