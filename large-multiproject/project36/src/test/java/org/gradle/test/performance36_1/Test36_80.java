package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_80 {
    private final Production36_80 production = new Production36_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}