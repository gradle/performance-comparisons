package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_54 {
    private final Production34_54 production = new Production34_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}