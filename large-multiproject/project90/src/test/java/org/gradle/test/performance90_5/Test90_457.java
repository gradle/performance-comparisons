package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_457 {
    private final Production90_457 production = new Production90_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}