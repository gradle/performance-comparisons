package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_40 {
    private final Production36_40 production = new Production36_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}