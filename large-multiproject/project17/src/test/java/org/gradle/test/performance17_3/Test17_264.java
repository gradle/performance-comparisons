package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_264 {
    private final Production17_264 production = new Production17_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}