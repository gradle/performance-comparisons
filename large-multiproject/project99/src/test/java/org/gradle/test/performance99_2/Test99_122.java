package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_122 {
    private final Production99_122 production = new Production99_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}