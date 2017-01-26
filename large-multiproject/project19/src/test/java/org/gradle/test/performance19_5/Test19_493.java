package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_493 {
    private final Production19_493 production = new Production19_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}