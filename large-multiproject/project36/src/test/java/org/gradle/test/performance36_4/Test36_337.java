package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_337 {
    private final Production36_337 production = new Production36_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}