package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_401 {
    private final Production99_401 production = new Production99_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}