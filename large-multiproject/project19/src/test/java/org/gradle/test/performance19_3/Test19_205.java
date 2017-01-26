package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_205 {
    private final Production19_205 production = new Production19_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}