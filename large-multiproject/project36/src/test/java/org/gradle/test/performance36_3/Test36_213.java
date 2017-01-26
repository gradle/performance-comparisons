package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_213 {
    private final Production36_213 production = new Production36_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}