package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_466 {
    private final Production36_466 production = new Production36_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}