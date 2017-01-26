package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_181 {
    private final Production99_181 production = new Production99_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}