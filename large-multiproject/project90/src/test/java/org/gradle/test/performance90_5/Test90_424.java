package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_424 {
    private final Production90_424 production = new Production90_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}