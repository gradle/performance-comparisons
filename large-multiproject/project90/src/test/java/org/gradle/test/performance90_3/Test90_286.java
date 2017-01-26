package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_286 {
    private final Production90_286 production = new Production90_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}