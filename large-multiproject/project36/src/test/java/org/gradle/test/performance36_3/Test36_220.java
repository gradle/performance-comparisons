package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_220 {
    private final Production36_220 production = new Production36_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}