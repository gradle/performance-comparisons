package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_497 {
    private final Production17_497 production = new Production17_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}