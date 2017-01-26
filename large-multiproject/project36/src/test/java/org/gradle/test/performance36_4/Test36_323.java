package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_323 {
    private final Production36_323 production = new Production36_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}