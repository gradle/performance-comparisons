package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_246 {
    private final Production90_246 production = new Production90_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}