package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_265 {
    private final Production36_265 production = new Production36_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}