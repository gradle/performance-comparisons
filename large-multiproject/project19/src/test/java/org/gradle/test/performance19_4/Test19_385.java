package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_385 {
    private final Production19_385 production = new Production19_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}