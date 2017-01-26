package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_41 {
    private final Production36_41 production = new Production36_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}