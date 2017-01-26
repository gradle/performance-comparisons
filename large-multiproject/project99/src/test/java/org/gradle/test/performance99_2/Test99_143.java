package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_143 {
    private final Production99_143 production = new Production99_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}