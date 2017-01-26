package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_499 {
    private final Production64_499 production = new Production64_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}