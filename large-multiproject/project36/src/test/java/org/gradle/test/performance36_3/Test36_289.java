package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_289 {
    private final Production36_289 production = new Production36_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}