package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_152 {
    private final Production19_152 production = new Production19_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}