package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_481 {
    private final Production36_481 production = new Production36_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}