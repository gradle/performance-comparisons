package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_154 {
    private final Production17_154 production = new Production17_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}