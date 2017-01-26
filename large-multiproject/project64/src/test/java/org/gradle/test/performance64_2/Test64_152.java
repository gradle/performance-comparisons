package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_152 {
    private final Production64_152 production = new Production64_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}