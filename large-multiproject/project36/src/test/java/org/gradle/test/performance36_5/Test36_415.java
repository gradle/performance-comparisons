package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_415 {
    private final Production36_415 production = new Production36_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}