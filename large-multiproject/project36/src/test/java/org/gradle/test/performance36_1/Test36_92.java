package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_92 {
    private final Production36_92 production = new Production36_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}