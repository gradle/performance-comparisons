package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_26 {
    private final Production36_26 production = new Production36_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}