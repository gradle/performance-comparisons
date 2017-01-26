package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_258 {
    private final Production36_258 production = new Production36_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}