package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_139 {
    private final Production36_139 production = new Production36_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}