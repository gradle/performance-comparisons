package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_202 {
    private final Production36_202 production = new Production36_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}