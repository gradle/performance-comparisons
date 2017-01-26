package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_8 {
    private final Production36_8 production = new Production36_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}