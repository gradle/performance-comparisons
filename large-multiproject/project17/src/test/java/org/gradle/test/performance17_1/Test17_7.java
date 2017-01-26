package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_7 {
    private final Production17_7 production = new Production17_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}