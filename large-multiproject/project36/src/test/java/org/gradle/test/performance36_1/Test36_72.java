package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_72 {
    private final Production36_72 production = new Production36_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}