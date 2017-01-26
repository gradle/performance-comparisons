package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_42 {
    private final Production36_42 production = new Production36_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}