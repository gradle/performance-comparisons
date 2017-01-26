package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_465 {
    private final Production99_465 production = new Production99_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}