package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_212 {
    private final Production36_212 production = new Production36_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}