package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_90 {
    private final Production36_90 production = new Production36_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}