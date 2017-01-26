package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_166 {
    private final Production36_166 production = new Production36_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}