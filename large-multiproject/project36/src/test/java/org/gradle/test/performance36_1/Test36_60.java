package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_60 {
    private final Production36_60 production = new Production36_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}