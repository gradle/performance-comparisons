package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_479 {
    private final Production42_479 production = new Production42_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}