package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_322 {
    private final Production99_322 production = new Production99_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}