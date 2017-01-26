package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_127 {
    private final Production36_127 production = new Production36_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}