package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_127 {
    private final Production99_127 production = new Production99_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}