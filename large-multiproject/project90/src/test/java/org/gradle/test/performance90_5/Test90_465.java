package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_465 {
    private final Production90_465 production = new Production90_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}