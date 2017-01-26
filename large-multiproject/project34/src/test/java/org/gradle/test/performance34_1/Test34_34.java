package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_34 {
    private final Production34_34 production = new Production34_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}