package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_112 {
    private final Production36_112 production = new Production36_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}