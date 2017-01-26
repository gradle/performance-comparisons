package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_61 {
    private final Production36_61 production = new Production36_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}