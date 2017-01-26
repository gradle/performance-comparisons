package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_398 {
    private final Production36_398 production = new Production36_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}