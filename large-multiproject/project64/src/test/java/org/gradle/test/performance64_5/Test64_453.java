package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_453 {
    private final Production64_453 production = new Production64_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}