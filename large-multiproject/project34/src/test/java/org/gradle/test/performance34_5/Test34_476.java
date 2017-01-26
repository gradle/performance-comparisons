package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_476 {
    private final Production34_476 production = new Production34_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}