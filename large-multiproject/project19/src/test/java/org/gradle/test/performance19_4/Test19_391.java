package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_391 {
    private final Production19_391 production = new Production19_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}