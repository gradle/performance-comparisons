package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_38 {
    private final Production36_38 production = new Production36_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}