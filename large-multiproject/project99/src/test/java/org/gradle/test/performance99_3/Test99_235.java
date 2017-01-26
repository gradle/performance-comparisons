package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_235 {
    private final Production99_235 production = new Production99_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}