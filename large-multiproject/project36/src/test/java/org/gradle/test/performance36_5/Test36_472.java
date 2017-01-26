package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_472 {
    private final Production36_472 production = new Production36_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}