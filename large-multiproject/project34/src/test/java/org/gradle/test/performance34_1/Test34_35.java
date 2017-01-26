package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_35 {
    private final Production34_35 production = new Production34_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}