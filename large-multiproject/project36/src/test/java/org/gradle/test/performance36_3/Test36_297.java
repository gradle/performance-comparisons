package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_297 {
    private final Production36_297 production = new Production36_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}