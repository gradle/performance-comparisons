package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_395 {
    private final Production36_395 production = new Production36_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}