package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_1 {
    private final Production99_1 production = new Production99_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}