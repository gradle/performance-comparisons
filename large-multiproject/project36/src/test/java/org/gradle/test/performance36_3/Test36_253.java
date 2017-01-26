package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_253 {
    private final Production36_253 production = new Production36_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}