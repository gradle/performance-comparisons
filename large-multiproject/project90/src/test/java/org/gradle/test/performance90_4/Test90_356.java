package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_356 {
    private final Production90_356 production = new Production90_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}