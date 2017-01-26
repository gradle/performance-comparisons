package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_262 {
    private final Production19_262 production = new Production19_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}