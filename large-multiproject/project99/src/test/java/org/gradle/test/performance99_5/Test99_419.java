package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_419 {
    private final Production99_419 production = new Production99_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}