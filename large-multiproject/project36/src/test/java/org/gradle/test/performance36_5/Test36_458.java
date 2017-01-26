package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_458 {
    private final Production36_458 production = new Production36_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}