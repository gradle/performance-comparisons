package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_323 {
    private final Production90_323 production = new Production90_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}