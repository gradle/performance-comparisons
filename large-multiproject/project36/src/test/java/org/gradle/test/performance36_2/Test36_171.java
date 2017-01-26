package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_171 {
    private final Production36_171 production = new Production36_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}