package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_499 {
    private final Production19_499 production = new Production19_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}