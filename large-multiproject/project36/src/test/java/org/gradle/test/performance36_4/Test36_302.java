package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_302 {
    private final Production36_302 production = new Production36_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}