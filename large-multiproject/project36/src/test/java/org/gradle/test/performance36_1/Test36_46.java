package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_46 {
    private final Production36_46 production = new Production36_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}