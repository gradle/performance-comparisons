package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_307 {
    private final Production90_307 production = new Production90_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}