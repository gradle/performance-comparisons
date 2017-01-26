package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_325 {
    private final Production36_325 production = new Production36_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}