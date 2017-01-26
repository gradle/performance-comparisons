package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_259 {
    private final Production36_259 production = new Production36_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}