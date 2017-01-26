package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_157 {
    private final Production36_157 production = new Production36_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}