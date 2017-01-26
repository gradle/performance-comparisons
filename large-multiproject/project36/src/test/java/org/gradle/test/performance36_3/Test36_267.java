package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_267 {
    private final Production36_267 production = new Production36_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}