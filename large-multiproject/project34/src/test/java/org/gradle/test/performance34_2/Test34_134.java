package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_134 {
    private final Production34_134 production = new Production34_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}