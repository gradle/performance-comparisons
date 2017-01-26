package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_173 {
    private final Production36_173 production = new Production36_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}