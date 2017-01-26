package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_466 {
    private final Production99_466 production = new Production99_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}