package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_338 {
    private final Production36_338 production = new Production36_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}