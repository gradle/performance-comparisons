package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_238 {
    private final Production36_238 production = new Production36_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}