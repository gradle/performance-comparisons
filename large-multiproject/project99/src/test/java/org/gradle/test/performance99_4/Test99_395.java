package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_395 {
    private final Production99_395 production = new Production99_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}