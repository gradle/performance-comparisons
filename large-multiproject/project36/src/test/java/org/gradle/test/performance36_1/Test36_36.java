package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_36 {
    private final Production36_36 production = new Production36_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}