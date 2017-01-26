package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_495 {
    private final Production36_495 production = new Production36_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}