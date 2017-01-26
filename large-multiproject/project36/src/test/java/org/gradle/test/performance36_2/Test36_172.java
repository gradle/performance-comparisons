package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_172 {
    private final Production36_172 production = new Production36_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}