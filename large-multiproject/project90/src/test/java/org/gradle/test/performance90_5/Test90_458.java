package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_458 {
    private final Production90_458 production = new Production90_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}