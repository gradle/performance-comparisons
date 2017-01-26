package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_319 {
    private final Production19_319 production = new Production19_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}