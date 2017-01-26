package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_227 {
    private final Production36_227 production = new Production36_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}