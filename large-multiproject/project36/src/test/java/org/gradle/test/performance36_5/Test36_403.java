package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_403 {
    private final Production36_403 production = new Production36_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}