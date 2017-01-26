package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_239 {
    private final Production36_239 production = new Production36_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}