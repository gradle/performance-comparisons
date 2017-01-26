package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_442 {
    private final Production90_442 production = new Production90_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}