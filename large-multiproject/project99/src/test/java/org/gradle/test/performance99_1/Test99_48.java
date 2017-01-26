package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_48 {
    private final Production99_48 production = new Production99_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}