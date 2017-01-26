package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_453 {
    private final Production19_453 production = new Production19_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}