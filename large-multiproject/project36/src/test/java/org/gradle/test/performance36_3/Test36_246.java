package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_246 {
    private final Production36_246 production = new Production36_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}