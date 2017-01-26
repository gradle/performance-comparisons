package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_214 {
    private final Production90_214 production = new Production90_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}