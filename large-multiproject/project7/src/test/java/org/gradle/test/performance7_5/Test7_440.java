package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_440 {
    private final Production7_440 production = new Production7_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}