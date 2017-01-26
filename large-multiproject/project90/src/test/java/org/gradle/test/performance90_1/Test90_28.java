package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_28 {
    private final Production90_28 production = new Production90_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}