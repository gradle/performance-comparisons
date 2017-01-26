package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_231 {
    private final Production36_231 production = new Production36_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}