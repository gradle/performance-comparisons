package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_315 {
    private final Production36_315 production = new Production36_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}