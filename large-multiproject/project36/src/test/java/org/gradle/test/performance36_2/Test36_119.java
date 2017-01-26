package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_119 {
    private final Production36_119 production = new Production36_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}