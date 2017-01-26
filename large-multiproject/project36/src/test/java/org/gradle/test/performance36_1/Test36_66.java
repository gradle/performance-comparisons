package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_66 {
    private final Production36_66 production = new Production36_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}