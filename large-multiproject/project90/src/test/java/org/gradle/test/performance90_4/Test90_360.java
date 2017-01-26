package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_360 {
    private final Production90_360 production = new Production90_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}