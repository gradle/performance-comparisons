package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_422 {
    private final Production36_422 production = new Production36_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}