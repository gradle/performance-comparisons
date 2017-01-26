package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_186 {
    private final Production36_186 production = new Production36_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}