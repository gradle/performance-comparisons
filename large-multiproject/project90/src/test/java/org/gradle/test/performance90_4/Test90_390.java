package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_390 {
    private final Production90_390 production = new Production90_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}