package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_67 {
    private final Production36_67 production = new Production36_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}