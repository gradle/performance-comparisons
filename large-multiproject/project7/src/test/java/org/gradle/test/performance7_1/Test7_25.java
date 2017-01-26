package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_25 {
    private final Production7_25 production = new Production7_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}