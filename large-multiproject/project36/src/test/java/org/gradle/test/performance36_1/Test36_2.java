package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_2 {
    private final Production36_2 production = new Production36_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}