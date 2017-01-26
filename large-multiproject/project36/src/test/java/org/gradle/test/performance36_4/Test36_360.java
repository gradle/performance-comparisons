package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_360 {
    private final Production36_360 production = new Production36_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}