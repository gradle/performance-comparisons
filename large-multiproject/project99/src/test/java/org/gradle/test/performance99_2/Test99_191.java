package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_191 {
    private final Production99_191 production = new Production99_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}