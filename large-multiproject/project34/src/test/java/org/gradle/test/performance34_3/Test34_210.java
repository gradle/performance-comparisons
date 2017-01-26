package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_210 {
    private final Production34_210 production = new Production34_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}