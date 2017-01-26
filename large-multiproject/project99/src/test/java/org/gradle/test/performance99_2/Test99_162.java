package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_162 {
    private final Production99_162 production = new Production99_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}