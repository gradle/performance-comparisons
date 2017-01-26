package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_417 {
    private final Production36_417 production = new Production36_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}