package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_143 {
    private final Production36_143 production = new Production36_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}