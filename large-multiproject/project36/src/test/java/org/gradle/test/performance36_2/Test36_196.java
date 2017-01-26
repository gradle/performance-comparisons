package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_196 {
    private final Production36_196 production = new Production36_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}