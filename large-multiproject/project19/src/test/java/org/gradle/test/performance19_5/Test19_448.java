package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_448 {
    private final Production19_448 production = new Production19_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}