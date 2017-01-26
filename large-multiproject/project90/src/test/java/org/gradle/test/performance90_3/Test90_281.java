package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_281 {
    private final Production90_281 production = new Production90_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}