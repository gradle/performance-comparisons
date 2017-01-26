package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_6 {
    private final Production99_6 production = new Production99_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}