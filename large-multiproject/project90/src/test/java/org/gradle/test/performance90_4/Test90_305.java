package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_305 {
    private final Production90_305 production = new Production90_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}