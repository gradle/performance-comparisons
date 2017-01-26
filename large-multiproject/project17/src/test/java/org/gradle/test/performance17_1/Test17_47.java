package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_47 {
    private final Production17_47 production = new Production17_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}