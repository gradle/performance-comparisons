package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_327 {
    private final Production19_327 production = new Production19_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}