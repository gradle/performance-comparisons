package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_217 {
    private final Production36_217 production = new Production36_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}