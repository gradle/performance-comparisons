package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_70 {
    private final Production17_70 production = new Production17_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}