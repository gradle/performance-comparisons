package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_59 {
    private final Production17_59 production = new Production17_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}