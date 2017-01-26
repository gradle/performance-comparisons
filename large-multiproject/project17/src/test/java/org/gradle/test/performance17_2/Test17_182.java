package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_182 {
    private final Production17_182 production = new Production17_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}