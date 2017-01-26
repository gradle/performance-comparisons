package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_268 {
    private final Production36_268 production = new Production36_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}