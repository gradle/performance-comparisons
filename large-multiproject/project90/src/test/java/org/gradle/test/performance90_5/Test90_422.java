package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_422 {
    private final Production90_422 production = new Production90_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}