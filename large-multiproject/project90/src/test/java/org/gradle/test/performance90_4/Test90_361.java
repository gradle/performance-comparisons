package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_361 {
    private final Production90_361 production = new Production90_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}