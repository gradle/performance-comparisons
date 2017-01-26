package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_452 {
    private final Production17_452 production = new Production17_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}