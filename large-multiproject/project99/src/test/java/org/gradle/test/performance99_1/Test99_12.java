package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_12 {
    private final Production99_12 production = new Production99_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}