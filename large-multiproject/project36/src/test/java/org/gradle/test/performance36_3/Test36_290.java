package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_290 {
    private final Production36_290 production = new Production36_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}