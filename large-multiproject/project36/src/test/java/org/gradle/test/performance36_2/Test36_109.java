package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_109 {
    private final Production36_109 production = new Production36_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}