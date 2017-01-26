package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_16 {
    private final Production19_16 production = new Production19_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}