package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_62 {
    private final Production36_62 production = new Production36_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}