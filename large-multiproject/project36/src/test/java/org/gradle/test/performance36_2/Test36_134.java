package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_134 {
    private final Production36_134 production = new Production36_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}