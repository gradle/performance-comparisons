package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_300 {
    private final Production90_300 production = new Production90_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}