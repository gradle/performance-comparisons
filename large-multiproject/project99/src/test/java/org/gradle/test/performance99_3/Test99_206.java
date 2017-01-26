package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_206 {
    private final Production99_206 production = new Production99_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}