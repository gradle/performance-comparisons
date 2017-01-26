package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_174 {
    private final Production36_174 production = new Production36_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}