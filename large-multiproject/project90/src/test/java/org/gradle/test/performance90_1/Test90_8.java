package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_8 {
    private final Production90_8 production = new Production90_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}