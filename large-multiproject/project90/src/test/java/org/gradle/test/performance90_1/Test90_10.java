package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_10 {
    private final Production90_10 production = new Production90_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}