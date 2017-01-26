package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_3 {
    private final Production36_3 production = new Production36_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}