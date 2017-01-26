package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_147 {
    private final Production17_147 production = new Production17_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}