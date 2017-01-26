package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_61 {
    private final Production99_61 production = new Production99_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}