package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_373 {
    private final Production99_373 production = new Production99_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}