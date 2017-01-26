package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_55 {
    private final Production19_55 production = new Production19_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}