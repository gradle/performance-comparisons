package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_347 {
    private final Production7_347 production = new Production7_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}