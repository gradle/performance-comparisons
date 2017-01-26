package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_421 {
    private final Production17_421 production = new Production17_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}