package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_423 {
    private final Production99_423 production = new Production99_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}