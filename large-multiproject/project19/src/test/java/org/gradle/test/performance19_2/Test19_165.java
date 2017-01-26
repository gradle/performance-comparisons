package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_165 {
    private final Production19_165 production = new Production19_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}