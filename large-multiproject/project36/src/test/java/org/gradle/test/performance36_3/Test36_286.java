package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_286 {
    private final Production36_286 production = new Production36_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}