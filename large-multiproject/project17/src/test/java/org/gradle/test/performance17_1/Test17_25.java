package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_25 {
    private final Production17_25 production = new Production17_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}