package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_309 {
    private final Production99_309 production = new Production99_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}