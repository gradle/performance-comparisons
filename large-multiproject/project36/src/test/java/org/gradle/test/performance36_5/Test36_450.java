package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_450 {
    private final Production36_450 production = new Production36_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}