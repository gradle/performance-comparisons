package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_63 {
    private final Production17_63 production = new Production17_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}