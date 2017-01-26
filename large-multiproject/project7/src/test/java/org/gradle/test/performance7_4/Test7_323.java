package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_323 {
    private final Production7_323 production = new Production7_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}