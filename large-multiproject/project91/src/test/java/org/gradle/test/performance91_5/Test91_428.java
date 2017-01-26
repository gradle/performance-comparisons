package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_428 {
    private final Production91_428 production = new Production91_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}