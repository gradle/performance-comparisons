package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_210 {
    private final Production36_210 production = new Production36_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}