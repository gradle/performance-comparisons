package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_388 {
    private final Production36_388 production = new Production36_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}