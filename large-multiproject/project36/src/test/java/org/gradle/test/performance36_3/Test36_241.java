package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_241 {
    private final Production36_241 production = new Production36_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}