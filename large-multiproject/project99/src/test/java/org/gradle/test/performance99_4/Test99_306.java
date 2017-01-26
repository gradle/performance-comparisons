package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_306 {
    private final Production99_306 production = new Production99_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}