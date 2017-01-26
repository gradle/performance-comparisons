package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_259 {
    private final Production90_259 production = new Production90_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}