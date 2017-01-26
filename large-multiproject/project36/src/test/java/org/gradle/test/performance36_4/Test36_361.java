package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_361 {
    private final Production36_361 production = new Production36_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}