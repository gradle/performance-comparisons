package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_320 {
    private final Production36_320 production = new Production36_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}