package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_195 {
    private final Production36_195 production = new Production36_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}