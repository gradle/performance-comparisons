package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_291 {
    private final Production36_291 production = new Production36_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}