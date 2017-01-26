package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_137 {
    private final Production99_137 production = new Production99_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}