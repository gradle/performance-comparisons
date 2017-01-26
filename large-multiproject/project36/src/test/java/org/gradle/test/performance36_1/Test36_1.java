package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_1 {
    private final Production36_1 production = new Production36_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}