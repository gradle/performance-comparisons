package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_19 {
    private final Production19_19 production = new Production19_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}