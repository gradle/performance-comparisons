package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_29 {
    private final Production36_29 production = new Production36_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}