package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_31 {
    private final Production34_31 production = new Production34_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}