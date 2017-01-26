package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_186 {
    private final Production90_186 production = new Production90_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}