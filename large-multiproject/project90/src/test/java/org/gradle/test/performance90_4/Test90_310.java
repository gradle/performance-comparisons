package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_310 {
    private final Production90_310 production = new Production90_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}