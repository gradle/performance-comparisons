package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_310 {
    private final Production36_310 production = new Production36_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}