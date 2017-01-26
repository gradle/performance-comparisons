package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_270 {
    private final Production99_270 production = new Production99_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}