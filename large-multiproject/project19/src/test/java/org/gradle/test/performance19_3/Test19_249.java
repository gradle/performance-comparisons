package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_249 {
    private final Production19_249 production = new Production19_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}