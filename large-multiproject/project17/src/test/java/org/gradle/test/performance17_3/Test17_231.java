package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_231 {
    private final Production17_231 production = new Production17_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}