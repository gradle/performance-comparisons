package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_305 {
    private final Production36_305 production = new Production36_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}