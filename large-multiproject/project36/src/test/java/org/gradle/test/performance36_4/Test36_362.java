package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_362 {
    private final Production36_362 production = new Production36_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}