package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_74 {
    private final Production90_74 production = new Production90_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}