package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_18 {
    private final Production99_18 production = new Production99_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}