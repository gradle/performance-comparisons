package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_153 {
    private final Production19_153 production = new Production19_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}