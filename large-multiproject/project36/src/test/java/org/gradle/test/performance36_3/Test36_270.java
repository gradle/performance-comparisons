package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_270 {
    private final Production36_270 production = new Production36_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}