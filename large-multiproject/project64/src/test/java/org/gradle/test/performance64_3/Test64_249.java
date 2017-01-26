package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_249 {
    private final Production64_249 production = new Production64_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}