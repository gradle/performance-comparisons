package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_53 {
    private final Production99_53 production = new Production99_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}