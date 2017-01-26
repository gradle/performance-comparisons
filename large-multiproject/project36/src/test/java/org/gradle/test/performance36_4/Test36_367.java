package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_367 {
    private final Production36_367 production = new Production36_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}