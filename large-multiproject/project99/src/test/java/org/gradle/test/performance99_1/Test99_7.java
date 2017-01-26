package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_7 {
    private final Production99_7 production = new Production99_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}