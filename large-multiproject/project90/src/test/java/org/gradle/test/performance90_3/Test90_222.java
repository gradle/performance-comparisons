package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_222 {
    private final Production90_222 production = new Production90_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}