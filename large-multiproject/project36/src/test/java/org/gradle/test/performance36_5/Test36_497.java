package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_497 {
    private final Production36_497 production = new Production36_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}