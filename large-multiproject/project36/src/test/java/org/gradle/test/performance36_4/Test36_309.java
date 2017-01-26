package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_309 {
    private final Production36_309 production = new Production36_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}