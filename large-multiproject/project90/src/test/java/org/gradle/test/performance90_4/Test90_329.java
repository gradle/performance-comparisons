package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_329 {
    private final Production90_329 production = new Production90_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}