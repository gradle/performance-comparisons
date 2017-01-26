package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_25 {
    private final Production36_25 production = new Production36_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}