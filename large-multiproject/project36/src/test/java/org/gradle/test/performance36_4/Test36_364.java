package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_364 {
    private final Production36_364 production = new Production36_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}