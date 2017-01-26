package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_347 {
    private final Production36_347 production = new Production36_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}