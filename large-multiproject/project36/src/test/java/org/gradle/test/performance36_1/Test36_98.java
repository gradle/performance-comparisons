package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_98 {
    private final Production36_98 production = new Production36_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}