package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_168 {
    private final Production36_168 production = new Production36_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}