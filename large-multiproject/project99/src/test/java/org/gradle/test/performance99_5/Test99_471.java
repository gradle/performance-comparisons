package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_471 {
    private final Production99_471 production = new Production99_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}