package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_303 {
    private final Production90_303 production = new Production90_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}