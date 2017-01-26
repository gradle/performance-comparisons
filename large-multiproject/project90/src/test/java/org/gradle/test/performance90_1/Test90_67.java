package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_67 {
    private final Production90_67 production = new Production90_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}