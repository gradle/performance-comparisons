package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_58 {
    private final Production36_58 production = new Production36_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}