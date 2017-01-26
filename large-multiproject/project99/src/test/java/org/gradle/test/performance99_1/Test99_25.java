package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_25 {
    private final Production99_25 production = new Production99_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}