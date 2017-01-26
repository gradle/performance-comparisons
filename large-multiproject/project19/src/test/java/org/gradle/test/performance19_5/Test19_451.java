package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_451 {
    private final Production19_451 production = new Production19_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}