package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_313 {
    private final Production36_313 production = new Production36_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}