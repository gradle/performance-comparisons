package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_63 {
    private final Production99_63 production = new Production99_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}