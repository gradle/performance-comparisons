package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_29 {
    private final Production90_29 production = new Production90_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}