package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_196 {
    private final Production90_196 production = new Production90_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}