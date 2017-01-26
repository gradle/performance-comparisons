package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_81 {
    private final Production36_81 production = new Production36_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}