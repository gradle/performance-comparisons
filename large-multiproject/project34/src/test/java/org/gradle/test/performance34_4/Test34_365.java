package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_365 {
    private final Production34_365 production = new Production34_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}