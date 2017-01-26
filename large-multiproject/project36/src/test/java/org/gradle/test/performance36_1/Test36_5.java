package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_5 {
    private final Production36_5 production = new Production36_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}