package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_356 {
    private final Production36_356 production = new Production36_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}