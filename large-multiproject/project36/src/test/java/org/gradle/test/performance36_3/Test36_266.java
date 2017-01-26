package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_266 {
    private final Production36_266 production = new Production36_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}