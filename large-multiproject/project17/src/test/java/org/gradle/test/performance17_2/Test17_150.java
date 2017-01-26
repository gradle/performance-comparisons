package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_150 {
    private final Production17_150 production = new Production17_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}