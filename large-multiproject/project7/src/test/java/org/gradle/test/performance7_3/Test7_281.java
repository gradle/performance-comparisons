package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_281 {
    private final Production7_281 production = new Production7_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}