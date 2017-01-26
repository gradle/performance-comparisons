package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_226 {
    private final Production36_226 production = new Production36_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}