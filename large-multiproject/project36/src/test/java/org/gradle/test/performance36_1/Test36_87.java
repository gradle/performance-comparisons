package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_87 {
    private final Production36_87 production = new Production36_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}