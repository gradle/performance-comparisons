package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_281 {
    private final Production36_281 production = new Production36_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}