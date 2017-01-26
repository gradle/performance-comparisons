package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_176 {
    private final Production19_176 production = new Production19_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}