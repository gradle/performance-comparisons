package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_154 {
    private final Production99_154 production = new Production99_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}