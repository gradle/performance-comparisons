package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_371 {
    private final Production36_371 production = new Production36_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}