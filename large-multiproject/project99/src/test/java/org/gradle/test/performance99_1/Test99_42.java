package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_42 {
    private final Production99_42 production = new Production99_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}