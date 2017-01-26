package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_63 {
    private final Production36_63 production = new Production36_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}