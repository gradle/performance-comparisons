package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_300 {
    private final Production36_300 production = new Production36_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}