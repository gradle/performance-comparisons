package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_181 {
    private final Production17_181 production = new Production17_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}