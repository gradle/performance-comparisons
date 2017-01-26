package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_4 {
    private final Production99_4 production = new Production99_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}