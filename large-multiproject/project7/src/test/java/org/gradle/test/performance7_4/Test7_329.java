package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_329 {
    private final Production7_329 production = new Production7_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}