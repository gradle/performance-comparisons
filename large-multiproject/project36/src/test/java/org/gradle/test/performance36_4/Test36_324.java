package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_324 {
    private final Production36_324 production = new Production36_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}