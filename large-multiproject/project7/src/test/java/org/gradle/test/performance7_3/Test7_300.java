package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_300 {
    private final Production7_300 production = new Production7_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}