package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_303 {
    private final Production36_303 production = new Production36_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}