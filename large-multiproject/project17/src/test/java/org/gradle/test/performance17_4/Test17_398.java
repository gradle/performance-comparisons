package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_398 {
    private final Production17_398 production = new Production17_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}