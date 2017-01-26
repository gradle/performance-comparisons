package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_154 {
    private final Production90_154 production = new Production90_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}