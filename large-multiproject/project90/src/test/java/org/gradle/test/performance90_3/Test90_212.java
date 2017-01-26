package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_212 {
    private final Production90_212 production = new Production90_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}