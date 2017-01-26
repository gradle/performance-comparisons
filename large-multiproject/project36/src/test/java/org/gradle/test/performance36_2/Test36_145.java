package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_145 {
    private final Production36_145 production = new Production36_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}