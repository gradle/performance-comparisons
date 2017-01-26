package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_275 {
    private final Production19_275 production = new Production19_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}