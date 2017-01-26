package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_16 {
    private final Production17_16 production = new Production17_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}