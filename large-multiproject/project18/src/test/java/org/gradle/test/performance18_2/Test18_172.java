package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_172 {
    private final Production18_172 production = new Production18_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}