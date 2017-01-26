package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_31 {
    private final Production36_31 production = new Production36_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}