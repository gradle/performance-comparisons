package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_435 {
    private final Production36_435 production = new Production36_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}