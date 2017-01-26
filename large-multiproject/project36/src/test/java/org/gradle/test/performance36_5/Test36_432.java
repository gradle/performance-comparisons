package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_432 {
    private final Production36_432 production = new Production36_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}