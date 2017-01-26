package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_437 {
    private final Production36_437 production = new Production36_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}