package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_7 {
    private final Production36_7 production = new Production36_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}