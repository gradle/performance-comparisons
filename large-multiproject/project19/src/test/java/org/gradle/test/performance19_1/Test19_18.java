package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_18 {
    private final Production19_18 production = new Production19_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}