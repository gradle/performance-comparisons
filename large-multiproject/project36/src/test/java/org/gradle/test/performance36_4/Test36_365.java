package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_365 {
    private final Production36_365 production = new Production36_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}