package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_36 {
    private final Production90_36 production = new Production90_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}