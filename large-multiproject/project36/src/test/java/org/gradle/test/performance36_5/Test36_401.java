package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_401 {
    private final Production36_401 production = new Production36_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}