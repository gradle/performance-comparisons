package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_292 {
    private final Production19_292 production = new Production19_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}