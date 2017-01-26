package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_204 {
    private final Production36_204 production = new Production36_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}