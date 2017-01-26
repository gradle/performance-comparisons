package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_497 {
    private final Production99_497 production = new Production99_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}