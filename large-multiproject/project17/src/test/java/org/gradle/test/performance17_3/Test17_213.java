package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_213 {
    private final Production17_213 production = new Production17_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}