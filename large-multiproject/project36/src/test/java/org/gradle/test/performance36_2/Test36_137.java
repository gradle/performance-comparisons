package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_137 {
    private final Production36_137 production = new Production36_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}