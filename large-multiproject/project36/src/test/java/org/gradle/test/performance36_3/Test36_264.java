package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_264 {
    private final Production36_264 production = new Production36_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}