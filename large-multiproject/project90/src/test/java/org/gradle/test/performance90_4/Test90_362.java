package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_362 {
    private final Production90_362 production = new Production90_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}