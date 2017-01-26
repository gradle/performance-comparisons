package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_462 {
    private final Production36_462 production = new Production36_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}