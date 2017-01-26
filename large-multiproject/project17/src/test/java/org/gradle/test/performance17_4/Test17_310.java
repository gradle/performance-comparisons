package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_310 {
    private final Production17_310 production = new Production17_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}