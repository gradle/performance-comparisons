package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_373 {
    private final Production90_373 production = new Production90_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}