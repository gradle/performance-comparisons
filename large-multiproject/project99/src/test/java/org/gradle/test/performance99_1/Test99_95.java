package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_95 {
    private final Production99_95 production = new Production99_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}