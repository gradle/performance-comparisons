package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_220 {
    private final Production17_220 production = new Production17_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}