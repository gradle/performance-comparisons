package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_335 {
    private final Production19_335 production = new Production19_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}