package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_133 {
    private final Production19_133 production = new Production19_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}