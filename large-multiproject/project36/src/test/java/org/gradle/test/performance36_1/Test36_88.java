package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_88 {
    private final Production36_88 production = new Production36_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}