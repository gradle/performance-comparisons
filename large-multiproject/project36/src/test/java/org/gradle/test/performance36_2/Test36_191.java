package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_191 {
    private final Production36_191 production = new Production36_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}