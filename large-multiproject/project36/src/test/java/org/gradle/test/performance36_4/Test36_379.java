package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_379 {
    private final Production36_379 production = new Production36_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}