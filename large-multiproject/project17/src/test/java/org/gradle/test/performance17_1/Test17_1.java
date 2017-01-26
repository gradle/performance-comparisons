package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_1 {
    private final Production17_1 production = new Production17_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}