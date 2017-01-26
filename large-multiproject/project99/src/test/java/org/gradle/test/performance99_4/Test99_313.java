package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_313 {
    private final Production99_313 production = new Production99_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}