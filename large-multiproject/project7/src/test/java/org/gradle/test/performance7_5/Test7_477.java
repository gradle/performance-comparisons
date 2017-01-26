package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_477 {
    private final Production7_477 production = new Production7_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}