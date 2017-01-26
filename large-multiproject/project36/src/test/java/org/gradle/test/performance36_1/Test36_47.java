package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_47 {
    private final Production36_47 production = new Production36_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}