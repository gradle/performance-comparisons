package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_399 {
    private final Production19_399 production = new Production19_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}