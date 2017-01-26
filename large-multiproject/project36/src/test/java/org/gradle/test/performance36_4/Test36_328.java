package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_328 {
    private final Production36_328 production = new Production36_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}