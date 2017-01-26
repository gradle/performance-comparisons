package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_289 {
    private final Production90_289 production = new Production90_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}