package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_243 {
    private final Production99_243 production = new Production99_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}