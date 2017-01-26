package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_33 {
    private final Production36_33 production = new Production36_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}