package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_337 {
    private final Production7_337 production = new Production7_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}