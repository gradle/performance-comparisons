package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_500 {
    private final Production36_500 production = new Production36_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}