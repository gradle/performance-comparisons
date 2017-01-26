package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_295 {
    private final Production36_295 production = new Production36_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}