package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_180 {
    private final Production17_180 production = new Production17_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}