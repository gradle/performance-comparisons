package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_54 {
    private final Production17_54 production = new Production17_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}