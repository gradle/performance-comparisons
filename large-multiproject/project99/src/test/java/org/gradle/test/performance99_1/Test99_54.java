package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_54 {
    private final Production99_54 production = new Production99_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}