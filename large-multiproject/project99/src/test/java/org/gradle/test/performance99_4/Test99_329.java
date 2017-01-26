package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_329 {
    private final Production99_329 production = new Production99_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}