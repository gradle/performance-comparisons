package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_482 {
    private final Production36_482 production = new Production36_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}