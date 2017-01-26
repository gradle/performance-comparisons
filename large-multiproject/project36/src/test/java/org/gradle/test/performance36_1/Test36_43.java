package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_43 {
    private final Production36_43 production = new Production36_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}