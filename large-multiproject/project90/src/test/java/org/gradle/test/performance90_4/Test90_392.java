package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_392 {
    private final Production90_392 production = new Production90_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}