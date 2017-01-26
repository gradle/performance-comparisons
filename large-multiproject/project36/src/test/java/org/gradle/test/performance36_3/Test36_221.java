package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_221 {
    private final Production36_221 production = new Production36_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}