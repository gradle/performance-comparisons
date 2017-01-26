package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_350 {
    private final Production90_350 production = new Production90_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}