package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_10 {
    private final Production36_10 production = new Production36_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}