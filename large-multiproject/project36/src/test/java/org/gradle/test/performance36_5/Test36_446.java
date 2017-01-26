package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_446 {
    private final Production36_446 production = new Production36_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}