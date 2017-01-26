package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_194 {
    private final Production19_194 production = new Production19_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}