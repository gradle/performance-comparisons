package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_222 {
    private final Production36_222 production = new Production36_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}