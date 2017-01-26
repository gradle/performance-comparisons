package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_474 {
    private final Production36_474 production = new Production36_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}