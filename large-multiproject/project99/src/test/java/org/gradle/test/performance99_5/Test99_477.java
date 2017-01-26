package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_477 {
    private final Production99_477 production = new Production99_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}