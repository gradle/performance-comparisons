package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_483 {
    private final Production19_483 production = new Production19_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}