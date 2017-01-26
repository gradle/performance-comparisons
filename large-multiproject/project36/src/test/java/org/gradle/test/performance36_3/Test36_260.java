package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_260 {
    private final Production36_260 production = new Production36_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}