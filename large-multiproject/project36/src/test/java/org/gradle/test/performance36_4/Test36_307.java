package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_307 {
    private final Production36_307 production = new Production36_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}