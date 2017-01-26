package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_465 {
    private final Production36_465 production = new Production36_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}