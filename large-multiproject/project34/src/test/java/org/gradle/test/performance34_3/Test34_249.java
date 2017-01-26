package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_249 {
    private final Production34_249 production = new Production34_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}