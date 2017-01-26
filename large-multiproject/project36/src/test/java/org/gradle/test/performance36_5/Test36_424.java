package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_424 {
    private final Production36_424 production = new Production36_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}