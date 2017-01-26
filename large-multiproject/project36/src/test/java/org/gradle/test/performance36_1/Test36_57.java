package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_57 {
    private final Production36_57 production = new Production36_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}