package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_187 {
    private final Production36_187 production = new Production36_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}