package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_268 {
    private final Production90_268 production = new Production90_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}