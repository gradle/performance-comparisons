package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_151 {
    private final Production17_151 production = new Production17_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}