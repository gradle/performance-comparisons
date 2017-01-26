package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_320 {
    private final Production90_320 production = new Production90_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}