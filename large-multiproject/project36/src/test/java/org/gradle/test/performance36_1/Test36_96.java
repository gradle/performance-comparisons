package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_96 {
    private final Production36_96 production = new Production36_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}