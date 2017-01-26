package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_440 {
    private final Production17_440 production = new Production17_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}