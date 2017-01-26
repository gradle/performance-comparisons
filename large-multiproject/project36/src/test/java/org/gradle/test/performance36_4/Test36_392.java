package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_392 {
    private final Production36_392 production = new Production36_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}