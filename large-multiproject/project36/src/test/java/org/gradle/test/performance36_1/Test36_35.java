package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_35 {
    private final Production36_35 production = new Production36_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}