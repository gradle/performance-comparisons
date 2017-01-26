package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_358 {
    private final Production36_358 production = new Production36_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}