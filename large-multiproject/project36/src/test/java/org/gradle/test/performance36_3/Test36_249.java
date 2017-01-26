package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_249 {
    private final Production36_249 production = new Production36_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}