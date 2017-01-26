package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_238 {
    private final Production90_238 production = new Production90_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}