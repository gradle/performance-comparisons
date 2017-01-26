package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_381 {
    private final Production36_381 production = new Production36_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}