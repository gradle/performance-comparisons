package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_390 {
    private final Production36_390 production = new Production36_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}