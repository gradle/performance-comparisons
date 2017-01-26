package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_126 {
    private final Production36_126 production = new Production36_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}